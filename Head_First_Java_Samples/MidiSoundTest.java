import javax.sound.midi.*;

public class MidiSoundTest {
    public static void main(String[] args) throws Exception {

        Synthesizer synth = MidiSystem.getSynthesizer();
        synth.open();

        MidiChannel channel = synth.getChannels()[0];

        channel.programChange(0);
        channel.noteOn(60, 100);

        Thread.sleep(3000);

        channel.noteOff(60);
        synth.close();
    }
}
