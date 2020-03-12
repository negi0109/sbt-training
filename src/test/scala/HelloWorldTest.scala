import org.scalatest.FunSuite

class HelloWorldTest extends FunSuite {
    test("HelloWorld.sum") {
        assert(HelloWorld.sum(1, 3) == 4)
        // assert(HelloWorld.sum(1, 3) == 6)
    }
}