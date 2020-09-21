package studentTracking.model;

import java.util.List;

/**
 * 菜单实体类
 */
public class Menu {
    /**
     * 菜单id
     */
    private long menuId;
    /**
     * 父级菜单
     */
    private long parentMenuId;
    /**
     * 菜单名单
     */
    private String menuName;

    //存取子菜单
    private List<Menu> sonMeus;



    /**
     * 菜单路径
     */
    private String address;



    private String promptName;
    private String goal;
    private String image;
    private String imageShoe;
    private String menuShow;
    private String expressshun;
    private String deleteFlag;

    public Menu() {
    }

    public Menu(long parentMenuId, String menuName, List<Menu> sonMeus, String address) {
        this.parentMenuId = parentMenuId;
        this.menuName = menuName;
        this.sonMeus = sonMeus;
        this.address = address;
    }

    public long getMenuId() {
        return menuId;
    }

    public void setMenuId(long menuId) {
        this.menuId = menuId;
    }

    public long getParentMenuId() {
        return parentMenuId;
    }

    public void setParentMenuId(long parentMenuId) {
        this.parentMenuId = parentMenuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPromptName() {
        return promptName;
    }

    public void setPromptName(String promptName) {
        this.promptName = promptName;
    }

    public String getGoal() {
        return goal;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getImageShoe() {
        return imageShoe;
    }

    public void setImageShoe(String imageShoe) {
        this.imageShoe = imageShoe;
    }

    public String getMenuShow() {
        return menuShow;
    }

    public void setMenuShow(String menuShow) {
        this.menuShow = menuShow;
    }

    public String getExpressshun() {
        return expressshun;
    }

    public void setExpressshun(String expressshun) {
        this.expressshun = expressshun;
    }

    public String getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public List<Menu> getSonMeus() {
        return sonMeus;
    }

    public void setSonMeus(List<Menu> sonMeus) {
        this.sonMeus = sonMeus;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "menuId=" + menuId +
                ", parentMenuId=" + parentMenuId +
                ", menuName='" + menuName + '\'' +
                ", sonMeus=" + sonMeus +
                ", address='" + address + '\'' +
                '}';
    }
}