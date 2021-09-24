
import * as kjs from './distributions/shared.js'

console.log(kjs)
console.log(kjs.default.jp.co.rakuten.oneapp.shared)
console.log(kjs.default.jp.co.rakuten.oneapp.shared.start)
console.log(typeof kjs.default.jp.co.rakuten.oneapp.shared.start)
const fun = kjs.default.jp.co.rakuten.oneapp.shared.start
console.log(fun("a"))
// console.log(kjs.default.jp.co.rakuten.oneapp.shared.start.start)

export * as kjs from './shared/build/distributions/shared.js'