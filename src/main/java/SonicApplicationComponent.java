import com.intellij.ide.ui.LafManager;

import javax.swing.*;

public class SonicApplicationComponent {
    public SonicApplicationComponent() {
        LafManager.getInstance().addLafManagerListener(bar -> updateProgressBarUi());
        updateProgressBarUi();
    }

    private void updateProgressBarUi() {
        UIManager.put("ProgressBarUI", SonicProgressBarUi.class.getName());
        UIManager.getDefaults().put(SonicProgressBarUi.class.getName(), SonicProgressBarUi.class);
    }
}
