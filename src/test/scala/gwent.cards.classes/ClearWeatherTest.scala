package cl.uchile.dcc
package gwent.cards.classes

import gwent.cards.classes.weathers.ClearWeather
import munit.FunSuite

class ClearWeatherTest extends FunSuite {
  val name1 = "Clear Weather"
  val name2 = "Clima Despejado"

  val classification1 = "Weather"
  val classification2 = "Clima"

  var weather1: ClearWeather = _
  var weather2: ClearWeather = _

  //iniciar zonas para pasarlas
  override def beforeEach(context: BeforeEach): Unit = {
    weather1 = new ClearWeather()
    weather2 = new ClearWeather()

  }
  test("A Clear Weather Card can be created with a name.") {
    assertEquals(weather.name, name)
  }
    //assertEquals(n, n)
    //assertEquals(n, new Weather("despejado"))
    //assertEquals(!n.equals(n))
}
