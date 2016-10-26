import com.clrs.CrackingTheCodingInterview
import org.scalatest.{FunSuite, _}

/**
  * Created by ignacio on 26/10/16.
  */
class CrackingTheCodingInterviewTest extends FunSuite with ShouldMatchers{

  test("Left Rotation"){
    val n = 5
    val k = 4
    val a = Array(1,2,3,4,5)
    CrackingTheCodingInterview.rotate(k,a) shouldEqual Array(5,1,2,3,4)
  }
}
