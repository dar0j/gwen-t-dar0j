package cl.uchile.dcc
package gwent

/** Creates a Weather Card
 *
 * @param nombre The name of the Weather card.
 * @constructor A Weather Card
 */
class Weather(nombre: String) extends ICard with Equals{
  /** The Weather Card name is stored in this variable.
   *
   */
  private val name: String = nombre

  override def equals(that: Any): Boolean = {
    if (canEqual(that)) {
      val other = that.asInstanceOf[Player]
      (this eq other)|| (name == other.name)
    } else {
      false
}
