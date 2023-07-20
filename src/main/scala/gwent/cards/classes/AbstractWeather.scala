package cl.uchile.dcc
package gwent.cards.classes

import gwent.cards.IWeather
import gwent.field.Field
import gwent.players.IPlayer

/** Creates the idea of a Weather Card thus having specific Weather classification.
 *
 *  @param _name The name of the Weather card, this will indicate the effect it will have. */
abstract class AbstractWeather(private val _name: String)
  extends IWeather {

  override val classification: String = "Weather"

  override def name: String = _name

  override def toField(player: IPlayer, field: Field): Unit = {
    field.weatherZone = Array[IWeather](this)

  }
}
