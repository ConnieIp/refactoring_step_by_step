# refactoring_step_by_step

1. code smell
- data class: private
- duplicate code: duplicate return
- comments: checkDriver method name
- driver age >= 18

2. add test

3. eliminate smell
- public -> private
    delicate:(add age getter)
    find usage
    replace(driver.age to driver.getAge())
- if... then return... else return... to return...
- checkDriver to checkDriverAge
- add validDriverAge field in Police class

4. run test