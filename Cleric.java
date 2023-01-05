import java.util.*;

public class Cleric {
    String name;
    int hp = 50;
    final int maxHp = 50;
    int mp = 10;
    final int maxMp = 10;

    public void selfAid() {
        this.mp = mp-5;
        this.hp = this.maxHp;
    }

    public int pray(int s) {
        int rec = new Random().nextInt(3) + s;
        int recoverMp = Math.min(this.maxMp - this.mp, rec);
        this.mp = mp + recoverMp;
        return recoverMp;
    }
}