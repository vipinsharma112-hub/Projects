import javax.sound.midi.*;
public class MusicTest1{
	public void play(){
		try{
			Sequencer sequencer=MidiSystem.getSequencer();
			System.out.println("Successfully got a sequencer");
		}  //java.desktop then javax.sound.midi then getSequencer
		catch(MidiUnavailableException e){
			System.out.println("bummer");
		}
	}
	public static void main(String[] args){
		MusicTest1 mt=new MusicTest1();
		mt.play();
	}
}
