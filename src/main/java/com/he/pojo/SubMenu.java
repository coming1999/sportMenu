package com.he.pojo;

/**
 * @author Kris He
 * @date 2022/01/07 12:53
 * 分支导航
 **/
public class SubMenu {
    private int id;
    private String title;
    private String path;
    private int mid;

    public SubMenu() {
    }

    public SubMenu(String title, String path, int mid) {
        this.title = title;
        this.path = path;
        this.mid = mid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    @Override
    public String toString() {
        return "SubMenu{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", path='" + path + '\'' +
                ", mid=" + mid +
                '}';
    }
}
