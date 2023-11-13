
package calculate.interestbanking;

import calculate.interestbanking.ui.UI;

/**
 *
 * @author kei ti ti
 */
public class InterestBanking {

    public static void main(String[] args) {
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI().setVisible(true);
            }
        });
    }
}
