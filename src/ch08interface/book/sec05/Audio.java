package ch08interface.book.sec05;

public class Audio implements RemoteControl{

    private int volume;
    @Override
    public void turnOn() {
        System.out.println("볼륨켬");
    }

    @Override
    public void turnOff() {
        System.out.println("Audio끔");
    }

    @Override //RemoteControl 을 굳이 적어넣을 필요는 없다 ( 이미 인터페이스를 이행 중 )
    public void setVolume(int volume) {
    if(volume>RemoteControl.MAX_VOLUME){
        this.volume=RemoteControl.MAX_VOLUME;
    }else if(volume<RemoteControl.MIN_VOLUME){
        this.volume=RemoteControl.MIN_VOLUME;
    }else{
        this.volume=volume;
    }
        System.out.println("현재 Audio 볼륨"+volume);
    }
    private int memoryVolume;
    @Override
    public void setMute(boolean mute) {
        if(mute){
            this.memoryVolume=this.volume;
            System.out.println("무음 처리 합니다");
            setVolume(RemoteControl.MIN_VOLUME);
        }else{
            System.out.println("무음 해제 합니다");
            setVolume(this.memoryVolume);
        }
    }
}
