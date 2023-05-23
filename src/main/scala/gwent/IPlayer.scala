package cl.uchile.dcc
package gwent

// Interface that indicates the parameters and methods a player has.
trait IPlayer{
  private val name: String
  //side of the field
  protected var gems: Int = 2
  protected var D: Deck = List[Card]
  protected var H: Hand = List[Card]
  //def play(): Unit
  def draw(): Unit
}
