# Test For String Concatenation
**concat** vs. **+(operation)** vs. **StringBuilder**


**input**
---

AB-12345678-CD

// delete hyphen and concatenate with strings


**output**
---

AB12345678CD


**result**
---

**32bit environment**

* testConcat  ->  ---- nanoTime

* testPlus    ->  ---- nanoTime

* testStringBuilder ->  ---- nanoTime

⇒ StringBuilder is the best way concatenate with strings

**64bit environment**

* time to StringBuilder =	42973 nanoTime

* time to Concat =	12985 nanoTime

* time to Plus =		24423 nanoTime

⇒ Concat API is the best way 
