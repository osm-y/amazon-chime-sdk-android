package com.amazonaws.services.chime.sdk.meetings.audiovideo.video

/**
 * Contains configuration for a local video or content share to be sent
 *
 * @property maxBitRateKbps: Int - The max bit rate for video encoding. maxBitRateKbps has to be greater than 0
 * If set to 0, video client will default it to 1400 kbps and will scale down by numbers of video senders.
 * Actual quality achieved may vary throughout the call depending on what system and network can provide.
 */
class LocalVideoConfiguration(
    maxBitRateKbps: Int = 0
) {
    var maxBitRateKbps = maxBitRateKbps
    set(value) {
        field = if (value > 0) value else 0
    }
}
