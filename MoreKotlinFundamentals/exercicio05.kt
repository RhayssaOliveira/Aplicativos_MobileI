// Define uma enumeração para representar diferentes partes do dia
enum class Daypart {
    MORNING,    // Manhã
    AFTERNOON,  // Tarde
    EVENING,    // Noite
}

// Define uma classe de dados para representar um evento
data class Event(
    val title: String,          // Título do evento
    val description: String? = null, // Descrição opcional do evento
    val daypart: Daypart,       // Parte do dia em que o evento ocorre
    val duration: Int           // Duração do evento em minutos
)

fun main() {
    // Criação de alguns eventos
    val event1 = Event(title = "Wake up", description = "Time to get up", daypart = Daypart.MORNING, duration = 0)
    val event2 = Event(title = "Eat breakfast", daypart = Daypart.MORNING, duration = 15)
    val event3 = Event(title = "Learn about Kotlin", daypart = Daypart.AFTERNOON, duration = 30)
    val event4 = Event(title = "Practice Compose", daypart = Daypart.AFTERNOON, duration = 60)
    val event5 = Event(title = "Watch latest DevBytes video", daypart = Daypart.AFTERNOON, duration = 10)
    val event6 = Event(title = "Check out latest Android Jetpack library", daypart = Daypart.EVENING, duration = 45)

    // Armazena os eventos em uma lista
    val eventos = mutableListOf<Event>(event1, event2, event3, event4, event5, event6)

    // Agrupa os eventos por parte do dia
    val parteDia = eventos.groupBy { it.daypart }

    // Itera sobre cada parte do dia e seus eventos correspondentes
    parteDia.forEach { (daypart, events) ->
        println("$daypart: you have ${events.size} event(s).") // Imprime o nome da parte do dia e o número de eventos
    }
}
