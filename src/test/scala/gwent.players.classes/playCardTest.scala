package cl.uchile.dcc
package gwent.player.classification

import gwent.cards.{ICard, IWeather}
import gwent.cards.classes.units.{CloseCombat, Ranged, Siege}
import gwent.field.Field
import gwent.field.zones.Zone
import gwent.players.IPlayer

import cl.uchile.dcc.gwent.cards.classes.weathers.ClearWeather
import cl.uchile.dcc.gwent.players.classes.User
import munit.FunSuite

class UserPlayCardTest extends FunSuite {

  var user: IPlayer = _
  var deck1: List[ICard] = _
  var deck2: List[ICard] = List[ICard](rangedCard, closeCombatCard, siegeCard)
  var hand: List[ICard] = _
  var rangedCard: Ranged = _
  var closeCombatCard: CloseCombat = _
  var siegeCard: Siege = _
  var weatherCard: IWeather = _
  var rangedZone: Zone[Ranged] = _
  var closeCombatZone: Zone[CloseCombat] = _
  var siegeZone: Zone[Siege] = _
  var field: Field = _

  override def beforeEach(context: BeforeEach): Unit = {
    user = new User("A", deck1, hand)
    rangedCard = new Ranged("Ranged Card", 7)
    closeCombatCard = new CloseCombat("Close Combat Card", 1)
    siegeCard = new Siege("Siege Card", 21)
    weatherCard = new ClearWeather("Weather Card")
    field = new Field
  }

  test("Creation Test") {
    assertEquals(user.name, "A")
    assertEquals(user.gems, 2)
    assertEquals(user.hand(), Nil)
    assertEquals(user.deck(), Nil)
  }

  test("Drawing Card Test") {

  }

  test("Placing Ranged Card Test"){

  }

  test("Placing Close Combat Card Test") {

  }

  test("Placing Hand to Hand Card Test") {

  }

  test("Playing Card Test"){

  }

}
