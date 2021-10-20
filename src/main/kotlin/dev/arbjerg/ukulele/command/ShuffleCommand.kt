package dev.arbjerg.ukulele.command

import dev.arbjerg.ukulele.features.HelpContext
import dev.arbjerg.ukulele.jda.Command
import dev.arbjerg.ukulele.jda.CommandContext
import org.springframework.stereotype.Component

class ShuffleCommand {

    @Component
    class ShuffleCommand : Command("shuffle") {
        override suspend fun CommandContext.invoke() {
            player.shuffle()
            reply("List has been shuffled.")
        }

        override fun HelpContext.provideHelp() {
            addUsage("")
            addDescription("Pauses the playback.")
        }
    }
}