package cl.uchile.dcc
package gwent.cards

import cards.ICard

abstract class Card(_name: String,
                    _clasification: String) extends ICard {
  def name: String = _name
  def clasification: String = _clasification//override?

  def bitingFrost(): Unit = {
    set all force of cc units on cczone to 1 both fields
  }

  def impenetrableMist(): Unit = {
    set all force of Range units on range zone to 1 both felds
  }

  def torrentialRain(): Unit = {
    set all siege units in siege zone to 1 both fields
  }

  def clearWeather(): Unit = {
    set all force to original values
  }
}
