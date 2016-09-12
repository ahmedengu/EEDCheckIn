/**
 * This class contains generated code from the Codename One Designer, DO NOT MODIFY!
 * This class is designed for subclassing that way the code generator can overwrite it
 * anytime without erasing your changes which should exist in a subclass!
 * For details about this file and how it works please read this blog post:
 * http://codenameone.blogspot.com/2010/10/ui-builder-class-how-to-actually-use.html
*/
package generated;

import com.codename1.ui.*;
import com.codename1.ui.util.*;
import com.codename1.ui.plaf.*;
import java.util.Hashtable;
import com.codename1.ui.events.*;

public abstract class StateMachineBase extends UIBuilder {
    private Container aboutToShowThisContainer;
    /**
     * this method should be used to initialize variables instead of
     * the constructor/class scope to avoid race conditions
     */
    /**
    * @deprecated use the version that accepts a resource as an argument instead
    
**/
    protected void initVars() {}

    protected void initVars(Resources res) {}

    public StateMachineBase(Resources res, String resPath, boolean loadTheme) {
        startApp(res, resPath, loadTheme);
    }

    public Container startApp(Resources res, String resPath, boolean loadTheme) {
        initVars();
        UIBuilder.registerCustomComponent("Container", com.codename1.ui.Container.class);
        UIBuilder.registerCustomComponent("Form", com.codename1.ui.Form.class);
        UIBuilder.registerCustomComponent("Button", com.codename1.ui.Button.class);
        UIBuilder.registerCustomComponent("Label", com.codename1.ui.Label.class);
        UIBuilder.registerCustomComponent("TextField", com.codename1.ui.TextField.class);
        UIBuilder.registerCustomComponent("RadioButton", com.codename1.ui.RadioButton.class);
        if(loadTheme) {
            if(res == null) {
                try {
                    if(resPath.endsWith(".res")) {
                        res = Resources.open(resPath);
                        System.out.println("Warning: you should construct the state machine without the .res extension to allow theme overlays");
                    } else {
                        res = Resources.openLayered(resPath);
                    }
                } catch(java.io.IOException err) { err.printStackTrace(); }
            }
            initTheme(res);
        }
        if(res != null) {
            setResourceFilePath(resPath);
            setResourceFile(res);
            initVars(res);
            return showForm(getFirstFormName(), null);
        } else {
            Form f = (Form)createContainer(resPath, getFirstFormName());
            initVars(fetchResourceFile());
            beforeShow(f);
            f.show();
            postShow(f);
            return f;
        }
    }

    protected String getFirstFormName() {
        return "Main";
    }

    public Container createWidget(Resources res, String resPath, boolean loadTheme) {
        initVars();
        UIBuilder.registerCustomComponent("Container", com.codename1.ui.Container.class);
        UIBuilder.registerCustomComponent("Form", com.codename1.ui.Form.class);
        UIBuilder.registerCustomComponent("Button", com.codename1.ui.Button.class);
        UIBuilder.registerCustomComponent("Label", com.codename1.ui.Label.class);
        UIBuilder.registerCustomComponent("TextField", com.codename1.ui.TextField.class);
        UIBuilder.registerCustomComponent("RadioButton", com.codename1.ui.RadioButton.class);
        if(loadTheme) {
            if(res == null) {
                try {
                    res = Resources.openLayered(resPath);
                } catch(java.io.IOException err) { err.printStackTrace(); }
            }
            initTheme(res);
        }
        return createContainer(resPath, "Main");
    }

    protected void initTheme(Resources res) {
            String[] themes = res.getThemeResourceNames();
            if(themes != null && themes.length > 0) {
                UIManager.getInstance().setThemeProps(res.getTheme(themes[0]));
            }
    }

    public StateMachineBase() {
    }

    public StateMachineBase(String resPath) {
        this(null, resPath, true);
    }

    public StateMachineBase(Resources res) {
        this(res, null, true);
    }

    public StateMachineBase(String resPath, boolean loadTheme) {
        this(null, resPath, loadTheme);
    }

    public StateMachineBase(Resources res, boolean loadTheme) {
        this(res, null, loadTheme);
    }

    public com.codename1.ui.Label findVName(Component root) {
        return (com.codename1.ui.Label)findByName("vName", root);
    }

    public com.codename1.ui.Label findVName() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("vName", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("vName", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findButton1(Component root) {
        return (com.codename1.ui.Button)findByName("Button1", root);
    }

    public com.codename1.ui.Button findButton1() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("Button1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("Button1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findVIsHeIn(Component root) {
        return (com.codename1.ui.Label)findByName("vIsHeIn", root);
    }

    public com.codename1.ui.Label findVIsHeIn() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("vIsHeIn", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("vIsHeIn", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel10(Component root) {
        return (com.codename1.ui.Label)findByName("Label10", root);
    }

    public com.codename1.ui.Label findLabel10() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label10", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label10", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel(Component root) {
        return (com.codename1.ui.Label)findByName("Label", root);
    }

    public com.codename1.ui.Label findLabel() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer1(Component root) {
        return (com.codename1.ui.Container)findByName("Container1", root);
    }

    public com.codename1.ui.Container findContainer1() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer2(Component root) {
        return (com.codename1.ui.Container)findByName("Container2", root);
    }

    public com.codename1.ui.Container findContainer2() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container2", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container2", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel8(Component root) {
        return (com.codename1.ui.Label)findByName("Label8", root);
    }

    public com.codename1.ui.Label findLabel8() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label8", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label8", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer(Component root) {
        return (com.codename1.ui.Container)findByName("Container", root);
    }

    public com.codename1.ui.Container findContainer() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel5(Component root) {
        return (com.codename1.ui.Label)findByName("Label5", root);
    }

    public com.codename1.ui.Label findLabel5() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label5", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label5", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel4(Component root) {
        return (com.codename1.ui.Label)findByName("Label4", root);
    }

    public com.codename1.ui.Label findLabel4() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label4", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label4", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findVEdu(Component root) {
        return (com.codename1.ui.Label)findByName("vEdu", root);
    }

    public com.codename1.ui.Label findVEdu() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("vEdu", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("vEdu", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel7(Component root) {
        return (com.codename1.ui.Label)findByName("Label7", root);
    }

    public com.codename1.ui.Label findLabel7() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label7", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label7", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findVBdate(Component root) {
        return (com.codename1.ui.Label)findByName("vBdate", root);
    }

    public com.codename1.ui.Label findVBdate() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("vBdate", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("vBdate", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel6(Component root) {
        return (com.codename1.ui.Label)findByName("Label6", root);
    }

    public com.codename1.ui.Label findLabel6() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label6", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label6", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findVWorkshop(Component root) {
        return (com.codename1.ui.Label)findByName("vWorkshop", root);
    }

    public com.codename1.ui.Label findVWorkshop() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("vWorkshop", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("vWorkshop", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findNewQR(Component root) {
        return (com.codename1.ui.Button)findByName("NewQR", root);
    }

    public com.codename1.ui.Button findNewQR() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("NewQR", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("NewQR", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findVEmail(Component root) {
        return (com.codename1.ui.Label)findByName("vEmail", root);
    }

    public com.codename1.ui.Label findVEmail() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("vEmail", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("vEmail", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findVGender(Component root) {
        return (com.codename1.ui.Label)findByName("vGender", root);
    }

    public com.codename1.ui.Label findVGender() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("vGender", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("vGender", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findVcheckOut(Component root) {
        return (com.codename1.ui.Button)findByName("VcheckOut", root);
    }

    public com.codename1.ui.Button findVcheckOut() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("VcheckOut", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("VcheckOut", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel1(Component root) {
        return (com.codename1.ui.Label)findByName("Label1", root);
    }

    public com.codename1.ui.Label findLabel1() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel3(Component root) {
        return (com.codename1.ui.Label)findByName("Label3", root);
    }

    public com.codename1.ui.Label findLabel3() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label3", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label3", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel2(Component root) {
        return (com.codename1.ui.Label)findByName("Label2", root);
    }

    public com.codename1.ui.Label findLabel2() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label2", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label2", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findCheck(Component root) {
        return (com.codename1.ui.Button)findByName("check", root);
    }

    public com.codename1.ui.Button findCheck() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("check", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("check", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findMobile(Component root) {
        return (com.codename1.ui.TextField)findByName("Mobile", root);
    }

    public com.codename1.ui.TextField findMobile() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("Mobile", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("Mobile", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findVday(Component root) {
        return (com.codename1.ui.Label)findByName("Vday", root);
    }

    public com.codename1.ui.Label findVday() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Vday", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Vday", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findVCeckIn(Component root) {
        return (com.codename1.ui.Button)findByName("VCeckIn", root);
    }

    public com.codename1.ui.Button findVCeckIn() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("VCeckIn", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("VCeckIn", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findCheckIn(Component root) {
        return (com.codename1.ui.Button)findByName("checkIn", root);
    }

    public com.codename1.ui.Button findCheckIn() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("checkIn", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("checkIn", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findVMobile(Component root) {
        return (com.codename1.ui.Label)findByName("vMobile", root);
    }

    public com.codename1.ui.Label findVMobile() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("vMobile", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("vMobile", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.RadioButton findDay2(Component root) {
        return (com.codename1.ui.RadioButton)findByName("day2", root);
    }

    public com.codename1.ui.RadioButton findDay2() {
        com.codename1.ui.RadioButton cmp = (com.codename1.ui.RadioButton)findByName("day2", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.RadioButton)findByName("day2", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findVCoupon(Component root) {
        return (com.codename1.ui.Label)findByName("vCoupon", root);
    }

    public com.codename1.ui.Label findVCoupon() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("vCoupon", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("vCoupon", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.RadioButton findDay1(Component root) {
        return (com.codename1.ui.RadioButton)findByName("day1", root);
    }

    public com.codename1.ui.RadioButton findDay1() {
        com.codename1.ui.RadioButton cmp = (com.codename1.ui.RadioButton)findByName("day1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.RadioButton)findByName("day1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findCheckOut(Component root) {
        return (com.codename1.ui.Button)findByName("checkOut", root);
    }

    public com.codename1.ui.Button findCheckOut() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("checkOut", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("checkOut", aboutToShowThisContainer);
        }
        return cmp;
    }

    protected void exitForm(Form f) {
        if("Visitor".equals(f.getName())) {
            exitVisitor(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(f.getName())) {
            exitMain(f);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void exitVisitor(Form f) {
    }


    protected void exitMain(Form f) {
    }

    protected void beforeShow(Form f) {
    aboutToShowThisContainer = f;
        if("Visitor".equals(f.getName())) {
            beforeVisitor(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(f.getName())) {
            beforeMain(f);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void beforeVisitor(Form f) {
    }


    protected void beforeMain(Form f) {
    }

    protected void beforeShowContainer(Container c) {
        aboutToShowThisContainer = c;
        if("Visitor".equals(c.getName())) {
            beforeContainerVisitor(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(c.getName())) {
            beforeContainerMain(c);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void beforeContainerVisitor(Container c) {
    }


    protected void beforeContainerMain(Container c) {
    }

    protected void postShow(Form f) {
        if("Visitor".equals(f.getName())) {
            postVisitor(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(f.getName())) {
            postMain(f);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void postVisitor(Form f) {
    }


    protected void postMain(Form f) {
    }

    protected void postShowContainer(Container c) {
        if("Visitor".equals(c.getName())) {
            postContainerVisitor(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(c.getName())) {
            postContainerMain(c);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void postContainerVisitor(Container c) {
    }


    protected void postContainerMain(Container c) {
    }

    protected void onCreateRoot(String rootName) {
        if("Visitor".equals(rootName)) {
            onCreateVisitor();
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(rootName)) {
            onCreateMain();
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void onCreateVisitor() {
    }


    protected void onCreateMain() {
    }

    protected Hashtable getFormState(Form f) {
        Hashtable h = super.getFormState(f);
        if("Visitor".equals(f.getName())) {
            getStateVisitor(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("Main".equals(f.getName())) {
            getStateMain(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

            return h;
    }


    protected void getStateVisitor(Form f, Hashtable h) {
    }


    protected void getStateMain(Form f, Hashtable h) {
    }

    protected void setFormState(Form f, Hashtable state) {
        super.setFormState(f, state);
        if("Visitor".equals(f.getName())) {
            setStateVisitor(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(f.getName())) {
            setStateMain(f, state);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void setStateVisitor(Form f, Hashtable state) {
    }


    protected void setStateMain(Form f, Hashtable state) {
    }

    protected void handleComponentAction(Component c, ActionEvent event) {
        Container rootContainerAncestor = getRootAncestor(c);
        if(rootContainerAncestor == null) return;
        String rootContainerName = rootContainerAncestor.getName();
        Container leadParentContainer = c.getParent().getLeadParent();
        if(leadParentContainer != null && leadParentContainer.getClass() != Container.class) {
            c = c.getParent().getLeadParent();
        }
        if(rootContainerName == null) return;
        if(rootContainerName.equals("Visitor")) {
            if("VCeckIn".equals(c.getName())) {
                onVisitor_VCeckInAction(c, event);
                return;
            }
            if("VcheckOut".equals(c.getName())) {
                onVisitor_VcheckOutAction(c, event);
                return;
            }
            if("NewQR".equals(c.getName())) {
                onVisitor_NewQRAction(c, event);
                return;
            }
        }
        if(rootContainerName.equals("Main")) {
            if("day1".equals(c.getName())) {
                onMain_Day1Action(c, event);
                return;
            }
            if("day2".equals(c.getName())) {
                onMain_Day2Action(c, event);
                return;
            }
            if("Mobile".equals(c.getName())) {
                onMain_MobileAction(c, event);
                return;
            }
            if("Button1".equals(c.getName())) {
                onMain_Button1Action(c, event);
                return;
            }
            if("check".equals(c.getName())) {
                onMain_CheckAction(c, event);
                return;
            }
            if("checkIn".equals(c.getName())) {
                onMain_CheckInAction(c, event);
                return;
            }
            if("checkOut".equals(c.getName())) {
                onMain_CheckOutAction(c, event);
                return;
            }
        }
    }

      protected void onVisitor_VCeckInAction(Component c, ActionEvent event) {
      }

      protected void onVisitor_VcheckOutAction(Component c, ActionEvent event) {
      }

      protected void onVisitor_NewQRAction(Component c, ActionEvent event) {
      }

      protected void onMain_Day1Action(Component c, ActionEvent event) {
      }

      protected void onMain_Day2Action(Component c, ActionEvent event) {
      }

      protected void onMain_MobileAction(Component c, ActionEvent event) {
      }

      protected void onMain_Button1Action(Component c, ActionEvent event) {
      }

      protected void onMain_CheckAction(Component c, ActionEvent event) {
      }

      protected void onMain_CheckInAction(Component c, ActionEvent event) {
      }

      protected void onMain_CheckOutAction(Component c, ActionEvent event) {
      }

}
