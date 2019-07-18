
# Date Classes

Four classes that deal only with date information, without respect to time or timezone:

- LocalDate
- YearMonth
- MonthDay
- Year

## LocalDate

- year-month-day
- provides LocalDate.of()
- this.with(...)
- getter methods to obtain information about the given date
    - getDayOfWeek

## YearMonth

- represents the month of a specific year

## MonthDay

- represents the day of a particular month

## Year

- represents a year
- Year.isLeap()



# Date and Time Classes

## LocalTime

- represents time of day without time-zone
- ex.: 10:15:30 (hours:minutes:seconds, hh:mm:ss)
- has methods:
    - public static now()
    - this.getHour()
    - this.getMinute()
    - this.getSec()
- does not store time zone
- does not store daylight saving information
- immutable
- nanosecond precision
- ex.: 13:45.30.123456789 can be stored
- value-based
- can be compared only by equals() method


## LocalDateTime

- handles date and time without a timezone
- date: month-day-year
- time: hour-minute-second-nanosecond
- is a combination of LocalDate and LocalTime
- provides methods:
    - now()
    - various *of* methods
    - *from* method for conversion from an instance of another temporal format
    - methods for adding and subtracting hours, minutes, seconds, days and months
