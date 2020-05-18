package edu.depaul.email;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StorageServiceTest {

  @Test
  @DisplayName("Test that a new StorageService is an instance of StorageService")
  void testSetupStorage() {
    StorageService t = new StorageService();
    assertTrue(t instanceof StorageService);
  }
  @Test
  @DisplayName("Test storeList method")
  void testStoreList() {
    StorageService t = new StorageService();
    ArrayList<String> s = new ArrayList<String>();
    s.add("This");
    s.add("That");
    s.add("The other thing");
    t.storeList(StorageService.StorageType.EMAIL, s);

  }
}
