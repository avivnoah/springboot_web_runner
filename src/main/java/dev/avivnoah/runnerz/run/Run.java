package dev.avivnoah.runnerz.run;

import java.time.LocalDateTime;

public record Run(
        Integer id,
        String time,
        LocalDateTime startedOn,
        LocalDateTime completedOn,
        Integer miles,
        Location location
) {}
