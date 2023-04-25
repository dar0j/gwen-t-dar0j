package cl.uchile.dcc
package gwent

/**Creates a Unit Card
 *
 * @param nombre The name of the Unit card.
 * @param strength The given strength of this Unit card.
 * @constructor A Unit Card
 */
class Units(nombre: String, strength: Int) extends ICard with Equals{
  /**
   * The Unit Card name is stored in this variable.
   */
  private val name: String = nombre
  /**
   * This variable represents the strength of the unit.
   */
  var force: Int = strength

  override def equals(that: Any): Boolean = {
    if (canEqual(that)) {
      val other = that.asInstanceOf[Player]
      (this eq other) || (name == other.name)
    } else {
      false

}