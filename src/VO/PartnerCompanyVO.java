package VO;

import java.util.ArrayList;
import java.util.List;

public class PartnerCompanyVO {
    private String companyName;//회사이름
    private String agentName;//대표이름
    private List<BookVO> publishingBooks= new ArrayList<>();//출판된 책 목록
    private String directorName;//담당자이름
    private String directPhoneNumber;//담당자 번호

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public List<BookVO> getPublishingBook() {
        return publishingBooks;
    }

    public void setPublishingBook(List<BookVO> publishingBooks) {
        this.publishingBooks = publishingBooks;
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    public String getDirectPhoneNumber() {
        return directPhoneNumber;
    }

    public void setDirectPhoneNumber(String directPhoneNumber) {
        this.directPhoneNumber = directPhoneNumber;
    }
}
