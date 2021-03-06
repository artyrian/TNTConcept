/**
 * TNTConcept Easy Enterprise Management by Autentia Real Bussiness Solution S.L.
 * Copyright (C) 2007 Autentia Real Bussiness Solution S.L.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.autentia.tnt.manager.account;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.autentia.tnt.businessobject.AccountEntry;
import com.autentia.tnt.businessobject.Bill;
import com.autentia.tnt.dao.SortCriteria;
import com.autentia.tnt.dao.hibernate.AccountEntryDAO;
import com.autentia.tnt.dao.search.AccountEntrySearch;
import com.autentia.tnt.util.SpringUtils;


public class AccountEntryManager {

/* AccountEntry - generated by stajanov (do not edit/delete) */



  /** Logger */
  private static final Log log = LogFactory.getLog(AccountEntryManager.class);

  /** AccountEntry DAO **/
  private AccountEntryDAO accountEntryDAO;

  /**
   * Get default AccountEntryManager as defined in Spring's configuration file.
   * @return the default singleton AccountEntryManager
   */
  public static AccountEntryManager getDefault()
  {
    return (AccountEntryManager)SpringUtils.getSpringBean("managerAccountEntry");
  }

  /** 
   * Empty constructor needed by CGLIB (Spring AOP)
   */
  protected AccountEntryManager()
  {
  }
	
  /** 
   * Default constructor 
   * @deprecated do not construct managers alone: use Spring's declared beans
   */
  public AccountEntryManager( AccountEntryDAO accountEntryDAO )
  {
    this.accountEntryDAO = accountEntryDAO;
  }

  /**
   * List accountEntrys. 
   * @param search search filter to apply
   * @param sort sorting criteria
   * @return the list of all accountEntrys sorted by requested criterion
   */
  public List<AccountEntry> getAllEntities(AccountEntrySearch search, SortCriteria sort){
    return accountEntryDAO.search( search, sort );
  }
  
  /**
   * Get accountEntry by primary key.
   * @return accountEntry selected by id.
   */
  public AccountEntry getEntityById(int id){
    return accountEntryDAO.getById(id);	    
  }
	
  /**
   * Insert accountEntry. 
   */
  public void insertEntity(AccountEntry accountEntry) {
    accountEntryDAO.insert(accountEntry);
  }
	 
  /**
   * Update accountEntry. 
   */
  public void updateEntity(AccountEntry accountEntry) {
    accountEntryDAO.update(accountEntry);
  }

  /**
   * Delete accountEntry. 
   */
  public void deleteEntity(AccountEntry accountEntry) {
    accountEntryDAO.delete(accountEntry);
  }

/* AccountEntry - generated by stajanov (do not edit/delete) */
 
	public List<AccountEntry> getAllMinusBill(int year, Bill bill, SortCriteria criteria){		
		AccountEntrySearch searchA = new AccountEntrySearch();		
			searchA.setYear(year);
			searchA.setBill(bill);
		return accountEntryDAO.search( searchA, criteria );
	}

}
