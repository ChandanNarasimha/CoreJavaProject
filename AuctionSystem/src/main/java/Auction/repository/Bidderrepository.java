package Auction.repository;

import java.util.Optional;

import Auction.entity.Bidderinfo;

public class Bidderrepository extends JpaRepository<Bidderinfo,> {
		
		Optional<Bidderinfo> findByAdminEmailIdAndAdminPassword(String emailId,String password);
}
