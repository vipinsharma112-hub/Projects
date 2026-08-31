import javax.sound.midi.*;

public class MidiTest {
    public static void main(String[] args) throws Exception {
        System.out.println("MIDI devices:");

        for (MidiDevice.Info info : MidiSystem.getMidiDeviceInfo()) {
            System.out.println(info.getName() + " - " + info.getDescription());
        }

        System.out.println("\nSynthesizer:");

        Synthesizer synth = MidiSystem.getSynthesizer();
        System.out.println(synth.getDeviceInfo().getName());

        synth.open();
        System.out.println("Synthesizer opened: " + synth.isOpen());
    }
}
