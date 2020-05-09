package edu.depaul.email;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmailFinderTest {
  @Test
  @DisplayName("Test that a new StorageService is an instance of StorageService")
  void testSetupStorage() {
    StorageService t = new StorageService();
    assertTrue(t instanceof StorageService);
  }

}
