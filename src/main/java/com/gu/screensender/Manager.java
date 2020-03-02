package com.gu.screensender;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import com.tulskiy.keymaster.common.HotKey;
import com.tulskiy.keymaster.common.HotKeyListener;
import com.tulskiy.keymaster.common.Provider;
import javax.swing.KeyStroke;


/**
 *
 * @author John
 */
public class Manager {
    private static LoginForm mLoginForm;
    private static MainForm mMainForm;
    private static Manager mManager;
    
    public static Manager getInstance() {
        if (mManager == null) {
            mManager = new Manager();            
        }
        
        return mManager;
    }
    
    public void setVisibleMainForm(boolean isVisible){
        if (mMainForm == null) {
            mMainForm = new MainForm();
        }
        
        mMainForm.setVisible(isVisible);
        mMainForm.setAutoRequestFocus(isVisible);
    }
    
    public void setVisibleLoginForm(boolean isVisible){
        if (mLoginForm == null) {
            mLoginForm = new LoginForm();
        }
        
        mLoginForm.setVisible(isVisible);
        mLoginForm.setAutoRequestFocus(isVisible);
    }  
    
    public void closeProgram() {
        System.exit(0);
    }
    
    public void init() {
        final Provider provider = Provider.getCurrentProvider(false);
        
        provider.register(KeyStroke.getKeyStroke("control alt F"), new HotKeyListener() {
            
            @Override
            public void onHotKey(HotKey hotkey) {
                System.out.println("zzzzzzz");

                provider.reset();

                provider.stop();
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

        });
    }
    
}
