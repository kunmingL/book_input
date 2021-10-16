package com.example.book_input.entity;


import lombok.Data;

@Data
public class TProCharpt {

  private long id;
  private String title;
  private String introduce;
  private String pic;
  private String requirement;
  private String chapType;
  private String label;
  private long creators;
  private long root;
  private long rootId;
  private String bookId;
  private long paintId;
  private long poemId;
  private long rootOrd;
  private long ord;
  private long isLock;
  private long finish;
  private String createBy;
  private java.sql.Timestamp createDat;
  private java.sql.Timestamp lUpdateDat;
  private long isDel;
  private long number;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public String getIntroduce() {
    return introduce;
  }

  public void setIntroduce(String introduce) {
    this.introduce = introduce;
  }


  public String getPic() {
    return pic;
  }

  public void setPic(String pic) {
    this.pic = pic;
  }


  public String getRequirement() {
    return requirement;
  }

  public void setRequirement(String requirement) {
    this.requirement = requirement;
  }


  public String getChapType() {
    return chapType;
  }

  public void setChapType(String chapType) {
    this.chapType = chapType;
  }


  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }


  public long getCreators() {
    return creators;
  }

  public void setCreators(long creators) {
    this.creators = creators;
  }


  public long getRoot() {
    return root;
  }

  public void setRoot(long root) {
    this.root = root;
  }


  public long getRootId() {
    return rootId;
  }

  public void setRootId(long rootId) {
    this.rootId = rootId;
  }


  public String getBookId() {
    return bookId;
  }

  public void setBookId(String bookId) {
    this.bookId = bookId;
  }


  public long getPaintId() {
    return paintId;
  }

  public void setPaintId(long paintId) {
    this.paintId = paintId;
  }


  public long getPoemId() {
    return poemId;
  }

  public void setPoemId(long poemId) {
    this.poemId = poemId;
  }


  public long getRootOrd() {
    return rootOrd;
  }

  public void setRootOrd(long rootOrd) {
    this.rootOrd = rootOrd;
  }


  public long getOrd() {
    return ord;
  }

  public void setOrd(long ord) {
    this.ord = ord;
  }


  public long getIsLock() {
    return isLock;
  }

  public void setIsLock(long isLock) {
    this.isLock = isLock;
  }


  public long getFinish() {
    return finish;
  }

  public void setFinish(long finish) {
    this.finish = finish;
  }


  public String getCreateBy() {
    return createBy;
  }

  public void setCreateBy(String createBy) {
    this.createBy = createBy;
  }


  public java.sql.Timestamp getCreateDat() {
    return createDat;
  }

  public void setCreateDat(java.sql.Timestamp createDat) {
    this.createDat = createDat;
  }


  public java.sql.Timestamp getLUpdateDat() {
    return lUpdateDat;
  }

  public void setLUpdateDat(java.sql.Timestamp lUpdateDat) {
    this.lUpdateDat = lUpdateDat;
  }


  public long getIsDel() {
    return isDel;
  }

  public void setIsDel(long isDel) {
    this.isDel = isDel;
  }


  public long getNumber() {
    return number;
  }

  public void setNumber(long number) {
    this.number = number;
  }

}
