package $package$
  
import $package$.test.TestSpec
import org.mockito.Matchers._
       
class FirstTest extends TestSpec {

  describe("a first test") {
    it("should work") {
      fail("oh no!")
    }
  }
}
