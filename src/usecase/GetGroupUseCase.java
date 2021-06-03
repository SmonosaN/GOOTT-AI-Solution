package usecase;

import entity.*;

public class GetGroupUseCase {
	
	public static void execute(IdealGroup ideal, LikelyGroup likely, DefectGroup defect) {
		ideal.showGroup();
		ideal.showUserList();
		System.out.println();
		
		likely.showGroup();
		likely.showUserList();
		System.out.println();
		
		defect.showGroup();
		defect.showUserList();
	}
}
