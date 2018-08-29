import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog("ใส่ตัวเลข 1 ตัวนะ","0");
        JOptionPane.showMessageDialog(null,input,"title",JOptionPane.INFORMATION_MESSAGE);
        int ans = JOptionPane.showConfirmDialog(null,"เธอรักหรือเปล่าจ๊ะ",
                "ถามเธอไงจะใครล่ะ",JOptionPane.YES_NO_OPTION);
        if(ans==JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null,"รักนะจุ๊บๆอิอิคิคิ");
        }else{
            JOptionPane.showMessageDialog(null,"จำไว้เลยนะเธอ");
        }
    }
}
