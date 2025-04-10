// GothamCrime.scala - Analyze Gotham’s crime for Barry Allen
// By Alfred Pennyworth, April 14, 2025

object GothamCrime {
  // Mock crime data (type, location, date)
  case class Crime(crimeType: String, location: String, date: String)
  
  def main(args: Array[String]): Unit = {
    // Sample data - replace with real logs, Master Barry
    val crimes = List(
      Crime("Robbery", "Crime Alley", "2025-04-01"),
      Crime("Assault", "Gotham Docks", "2025-04-02"),
      Crime("Theft", "Crime Alley", "2025-04-03"),
      Crime("Robbery", "Gotham Square", "2025-04-04"),
      Crime("Assault", "Crime Alley", "2025-04-05")
    )
    
    println("Gotham Crime Analysis:")
    
    // Total crimes
    val totalCrimes = crimes.length
    println(s"Total Incidents: $totalCrimes")
    
    // Crimes by type
    val byType = crimes.groupBy(_.crimeType).map {
      case (crimeType, list) => (crimeType, list.length)
    }
    println("\nCrimes by Type:")
    byType.foreach { case (t, c) => println(s"$t: $c") }
    
    // Hotspots by location
    val byLocation = crimes.groupBy(_.location).map {
      case (location, list) => (location, list.length)
    }.toList.sortBy(-_._2)
    println("\nCrime Hotspots:")
    byLocation.foreach { case (loc, c) => println(s"$loc: $c") }
    
    // Save to file (rudimentary - consider CSV for Master Bruce)
    import java.io.PrintWriter
    val writer = new PrintWriter("../docs/gotham_crime_report.txt")
    writer.write("Gotham Crime Report\n")
    writer.write(s"Total Incidents: $totalCrimes\n")
    writer.write("Crimes by Type:\n" + byType.map(t => s"${t._1}: ${t._2}").mkString("\n") + "\n")
    writer.write("Hotspots:\n" + byLocation.map(l => s"${l._1}: ${l._2}").mkString("\n"))
    writer.close()
    println("\nReport filed at SevenVoices/docs/gotham_crime_report.txt, sir!")
  }
}
