***** Boot Troubleshooting *****

Check microcode version:

dmesg | grep microcode

Check is hyperthreading is enabled:

grep '\<ht\>' /proc/cpuinfo -q && echo 1

Display CPU model, stepping and active microcode version:

$ grep 'stepping\|model\|microcode' /proc/cpuinfo

Investigate whether the microcode was loaded by the BIOS or by the kernel:

# journalctl --no-hostname -o short-monotonic --boot -0 | sed -n '1,/PM: Preparing system for sleep/p' | grep 'microcode\|smp'

If this:
microcode: microcode updated early to revision 0x

then microcode was loaded by the kernel.

As of 23.09 my microcode is updated and is loaded from the bios.


# mmcblk0p1 is my EFI partition
# mmcblk0p2 is my root partition
sudo mount /dev/mmcblk0p2 /mnt
sudo mkdir /mnt/boot/efi
sudo mount /dev/mmcblk0p1 /mnt/boot/efi
for i in /sys /proc /run /dev; do sudo mount --bind "$i" "/mnt$i"; done
modprobe efivars
efibootmgr --verbose
apt-get install --reinstall grub-efi-amd64
grub-install --no-nvram --root-directory=/mnt
chroot /mnt
update-grub
cd /boot/efi/EFI
cp -R ubuntu/ BOOT
cd BOOT cp grubx64.efi bootx64.efi
cp -R BOOT/ Linux
