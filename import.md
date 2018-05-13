Q: Does importing all classes in a package make my object file (.class or .jar) larger?
A: No, import only tells the compiler where to look for symbols.

Q: Is it less efficient to import all classes than only the classes I need?
A: No. The search for names is very efficient so there is no effective difference.

Q: Doesn't it provide better documentation to import each class explicitly?
A: This shows good intentions, but ...

It's hard to remember to remove classes when they are no longer used, so the import list is surprisingly often wrong. It can seriously slow down reading because unusual or unexpected class imports make me look for that class, only to discover that it must have been used in an earlier version.
Explicit class imports permit accidentally defining classes with names that conflict with the standard library names. This is very bad. Using "*" to import all classes prevents this dangerous naming accident.
It's annoying to always update this list, altho if you use NetBeans, fixing the list is only a click away (see below).
Q: I've imported java.awt.*, why do I also need java.awt.event.*?
A: The wildcard "*" only makes the classes in this package visible, not any of the subpackages.

Q: Why don't I need an import to use String, System, etc?
A: All classes in the java.lang package are visible without an import.

Q: Is the order of the imports important?
A: No. Group them for readability.
