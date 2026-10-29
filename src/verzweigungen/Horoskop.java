package verzweigungen;

public class Horoskop {

    static void main() {
        int day = 22;
        int month = 7;

        System.out.println(first(day) + second(day) + third(month));
    }

    static String first(int day) {
        return new String[] {
                "Im Berufsleben ",
                "In der Partnerschaft ",
                "In der Familie ",
                "In der Liebe "
        }[String.valueOf(day).charAt(0) - '0'];
    }

    static String second(int day) {
        return new String[] {
                "fehlt Ihnen die Ausdauer. ",
                "kündigen sich Veränderungen an. ",
                "lassen Erfolge auf sich warten. ",
                "neigen Sie zur Bequemlichkeit. ",
                "sind Sie besonders aktiv. ",
                "müssen Sie mit unangenehmen Überraschungen rechnen. ",
                "befinden Sie sich in einer produktiven Phase. ",
                "eilen Sie von Erfolg zu Erfolg. ",
                "sind Sie besonders kreativ. ",
                "kann es zu einer Auseinandersetzung kommen. "
        }[String.valueOf(day).charAt(1) - '0'];
    }

    static String third(int month) {
        return new String[] {
                "Lassen Sie sich nicht beeinflussen!",
                "Hören Sie auf den Rat eines Freundes!",
                "Seien Sie weniger kritisch!",
                "Ab und zu eine Pause einlegen!",
                "Geldausgaben verschieben!",
                "Werden Sie nicht übermütig!",
                "Denken Sie nicht nur an sich!",
                "Machen Sie weiter so!",
                "Suchen Sie eine Aussprache!",
                "Nicht immer nur an andere denken!",
                "Achten Sie auf Ihre Gesundheit!",
                "Idealer Zeitpunkt für einen Neuanfang!"
        }[month];
    }

}
