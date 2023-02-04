package baseball;

public class BaseBallTeam {
 // フィールド
    public String name; // チーム名
    public int win; // 勝ち
    public int lose; // 負け
    public int draw; // 引き分け
    public double rate; // 率

 // 引数ありのコンストラクタ
    public BaseBallTeam(String name, int win, int lose, int draw) {
        this.name = name;
        this.win = win;
        this.lose = lose;
        this.draw = draw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public int getLose() {
        return lose;
    }

    public void setLose(int lose) {
        this.lose = lose;
    }

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    public double getRate() {
        double rate = (double)win/(win + lose);
        return rate;
    }
    
    public void report() {
        this.rate = getRate();
        System.out.println(this.name + "の2022年の成績は"+ this.win + "勝"+ this.lose + "敗"+ this.lose + "分、勝率は" + this.rate + "です。");
    }
}
