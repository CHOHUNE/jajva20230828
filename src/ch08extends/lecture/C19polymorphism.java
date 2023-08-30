package ch08extends.lecture;

public class C19polymorphism {
    public static void main(String[] args) {
        Hero19 myHero = new Hero19();
        myHero.weapon = new Gun();
        myHero.attack();

        myHero.weapon = new Sword();
        myHero.attack();


        System.out.println("게임 종료...");
        //히어로 클래스- 웨폰 객체 - 어택메서드 생성 /객체  생성
        //어택 메서드 - 샷 메서드 ( 무기 마다 )
        // 건 - 스워드 - 웨폰 메서드 오버라이드
    }
}

class Hero19 {
    public Weapon weapon;

    public void attack() {
        weapon.shot();
    }
}

class Weapon {
    public void shot() {
        System.out.println("무기를 사용합니다.");
    }
}

class Gun extends Weapon {
    @Override
    public void shot() {
        System.out.println("총을 쏩니다.");
    }
}

class Sword extends Weapon {
    @Override
    public void shot() {
        System.out.println("검을 휘두릅니다.");
    }
}