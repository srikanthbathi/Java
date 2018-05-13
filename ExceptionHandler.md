Just as method specifies what arguments and what it returns, meathods also declates the exceptions that a method can throw.
(unless the exceptions are subclasses of runtimeexceptions). The list of thrown exceptions is part of a methods public interface.

Any method that might thown an exception must declare that exception(unless it is a subclass of runtime exceptions)

RuntimeExceptions are excempt, so the compiler wont check to see if yoy have declared them . But all non RuntimeExceptions are considered as "checked" exceptions because compiler checks to be certain you have knowledge that bad things could happen here.

Each method must either handle the checked exceptions by providing the "catch" clause or list each unhandled checked exceptions as a thrown exception. This rule is referred to as Java "handle or declare"requirement.

Again some exceptions are exempt for this rule. An object of type RuntimeException may be thrown from any method without being specified as part of the methods public interface.
