// FlashDecision.scala - Alfred helps Barry balance time
object FlashDecision {
  def main(args: Array[String]): Unit = {
    println("Barry’s Time Balance - Alfred’s Counsel")

    // Flash data (tweak as needed, Master Barry!)
    val priority = "Iris & Eobard"
    val threatLevel = 60        // Danger from Eobard (0-100)
    val irisNeeds = 70          // Iris’s urgency (0-100)
    val speedEnergy = 80        // Barry’s stamina (0-100)

    // Decision logic with if-else and logical operators
    if (threatLevel >= 60 && irisNeeds >= 60 && speedEnergy >= 70) {
      println(s"Both critical, Barry! Split time for $priority!")
      println(s"Threat: $threatLevel%, Iris: $irisNeeds%, Energy: $speedEnergy%")
    } else if (threatLevel >= 60 && irisNeeds < 60) {
      println(s"Eobard strikes—Threat $threatLevel%. Chase him, Iris can wait!")
    } else if (threatLevel < 60 && irisNeeds >= 60 && speedEnergy >= 50) {
      println(s"Iris calls—Need $irisNeeds%. Run to her, Eobard’s quiet!")
    } else if (threatLevel >= 60 && speedEnergy < 70) {
      println(s"Threat’s $threatLevel%, but energy’s $speedEnergy%. Rest, then tackle Eobard!")
    } else {
      println(s"Calm day—Threat: $threatLevel%, Iris: $irisNeeds%, Energy: $speedEnergy%. Recharge, lad!")
    }

    // Alfred’s wisdom
    if (threatLevel > 80 || irisNeeds > 80) {
      println("Danger or love peaks—speed up, Barry, no dawdling!")
    }
  }
}