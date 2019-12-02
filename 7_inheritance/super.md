
# *super* in Constructors

Invocation of a super class constructor __must__ be the first line in the subclass constructor

__Note:__
If a subclass constructor does not explicitly call a super class constructor, then Java compiler automatically inserts *super()* as the first line of the subclass constructor.
If the super class does not have an explicit no-argument constructor we will get a *compile time error*.
