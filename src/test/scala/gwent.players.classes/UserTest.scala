package cl.uchile.dcc
package gwent.players.classes

import cl.uchile.dcc.gwent.cards.ICard
import munit.FunSuite

import scala.collection.mutable.ArrayBuffer

class UserTest extends FunSuite {
  val name1 = "A"
  val name2 = "B"

  val gems1 = 2
  val gems2 = 1

  val deck1 = ArrayBuffer()
  val deck2 = ArrayBuffer[ICard]()

  var user1: User(name1, deck1) = _
  var user2: User(name1, deck1) = _
  var user3: User(name1, deck1) = _

  override def beforeEach(context: BeforeEach): Unit = {
    user1 = new User(name1, deck1)
    user2 = new User(name1, deck1)()
    user3 = new User(name1, deck1)

  }
  test("The name of the User(name1, d1) playing is COM") {
    assertEquals(user1.name, name1)
    assertNotEquals(user1.name, name2)

  }
  test("gems") {
    assertEquals(user1.gems, gems1)
  }
  test("The User(name1, d1) playing should have a Deck and a Hand") {
    assertEquals(user1.deck, deck1)
    assertNotEquals(user2.deck, deck1)
  }
}
/*test("equals") {
  assertEquals(n, n)
  assertEquals(n, new Player())
  assertEquals(!n.equals(n))
}*/

