 
package bean;

 
public class PaperCategoryBean {
    private int catId;
    private String catName;
    private String catDetail;

    public PaperCategoryBean() {
    }

    public PaperCategoryBean(int catId, String catName, String catDetail) {
        this.catId = catId;
        this.catName = catName;
        this.catDetail = catDetail;
    }

    public int getCatId() {
        return catId;
    }

    public void setCatId(int catId) {
        this.catId = catId;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public String getCatDetail() {
        return catDetail;
    }

    public void setCatDetail(String catDetail) {
        this.catDetail = catDetail;
    }

    @Override
    public String toString() {
        return "PaperCategoryBean{" + "catId=" + catId + ", catName=" + catName + ", catDetail=" + catDetail + '}';
    }
    
    
}
