package baseball;

public class Review03 {

    public static void main(String[] args) {
        
        BaseBallTeam yakult = new BaseBallTeam("東京ヤクルトスワローズ",80,59,4);
        BaseBallTeam beystars = new BaseBallTeam("横浜DeNAベイスターズ",73,68,2);
        BaseBallTeam taigars = new BaseBallTeam("阪神タイガース",68,71,4);
        BaseBallTeam jaiants = new BaseBallTeam("読売ジャイアンツ",68,72,3);
        BaseBallTeam carp = new BaseBallTeam("広島東洋カープ",66,74,3);
        BaseBallTeam doragons = new BaseBallTeam("中日ドラゴンズ",66,75,2);
        
        yakult.report();
        beystars.report();
        taigars.report();
        jaiants.report();
        carp.report();
        doragons.report();
    }

}
