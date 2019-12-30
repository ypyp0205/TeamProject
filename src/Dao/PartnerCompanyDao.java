package Dao;

import VO.PartnerCompanyVO;

import java.util.ArrayList;
import java.util.Scanner;

public class PartnerCompanyDao {
    public static ArrayList<PartnerCompanyVO> partnerCompanys = new ArrayList<>();

    public void addPartnerCompany() {
        Scanner scanner = new Scanner(System.in);
        String companyName;
        String agentName;
        String directorName;
        String directPhoneNumber;
        System.out.print("회사이름 입력: ");
        companyName = scanner.nextLine();
        System.out.println("대표자이름 입력:");
        agentName = scanner.nextLine();
        System.out.println("담당자 이름 입력:");
        directorName = scanner.nextLine();
        System.out.println("담당자 연락처 입력:");
        directPhoneNumber = scanner.nextLine();
        PartnerCompanyVO partnerCompanyVO = new PartnerCompanyVO();
        partnerCompanyVO.setCompanyName(companyName);
        partnerCompanyVO.setDirectPhoneNumber(directPhoneNumber);
        partnerCompanyVO.setDirectorName(directorName);
        partnerCompanyVO.setAgentName(agentName);
        int searchIdx = 0;
        for (int i = 0; i < BookDao.BookList.size(); i++) {
            if (BookDao.BookList.get(i).getPublishCompanyName().equals(companyName)) {
                searchIdx = i;
                break;
            }
            partnerCompanyVO.setPublishingBook(BookDao.BookList.get(searchIdx).getName());
            partnerCompanys.add(partnerCompanyVO);
        }
    }

    public void deletePartnerCompany() {
        Scanner scanner = new Scanner(System.in);
        String companyName;
        System.out.print("회사 이름을 입력하세요:");
        companyName = scanner.nextLine();
        for (int i = 0; i < partnerCompanys.size(); i++) {
            if (partnerCompanys.get(i).getCompanyName().equals(companyName)) {
                partnerCompanys.remove(i);
            }
        }
    }

    public void addTransactionalInformation() {


    }
}
