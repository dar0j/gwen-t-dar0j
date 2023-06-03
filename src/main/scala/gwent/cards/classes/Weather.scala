package cl.uchile.dcc
package gwent.cards.classes

import cl.uchile.dcc.gwent.cards.AbstractCard

/** Creates a Weather Card
 *
 * @param _name The name of the Weather card.
 * @constructor A Weather Card
 */
class Weather(_name: String)
  extends AbstractCard(_name){

  val classification = "Weather"
  /** Sets the force of all Close Combat Units
 * on both players' side of the field to 1. */
  def bitingFrost(): Unit = {
  }

  /** Sets the force of all Range Units
   * on both players' side of the field to 1. */
  def impenetrableMist(): Unit = {
  }

  /** Sets the force of all Siege Units
   * on both players' side of the field to 1. */
  def torrentialRain(): Unit = {
  }

  /** Clears all effects on the field. */
  def clearWeather(): Unit = {
    //set all force to original values
  }
}
