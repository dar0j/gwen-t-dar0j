package cl.uchile.dcc
package gwent.players.classes

import cl.uchile.dcc.gwent.cards.ICard
import munit.FunSuite

import scala.collection.mutable.ArrayBuffer

class ComputerTest extends FunSuite {
  val name1 = "COM"
  val name2 = "PC"

  val gems1 = 2
  val gems2 = 1

  val deck1 = ArrayBuffer()
  val deck2= ArrayBuffer[ICard]()

  var pc1: Computer = _
  var pc2: Computer = _
  var pc3: Computer = _

  override def beforeEach(context: BeforeEach): Unit = {
    pc1 = new Computer
    pc2 = new Computer()
    pc3 = new Computer

  }
  test("The name of the Computer playing is COM") {
    assertEquals(pc1.name, name1)
    assertNotEquals(pc1.name, name2)

  }
  test("gems") {
    assertEquals(pc1.gems, gems1)
  }
  test("The Computer playing should have a Deck and a Hand") {
    assertEquals(pc1.deck, deck1)
    assertNotEquals(pc2.deck, deck1)
  }
}

/*  test("equals"){
    assertEquals(n,n)
    assertEquals(n, new Computer())
    assertEquals(!n.equals(n))*/
