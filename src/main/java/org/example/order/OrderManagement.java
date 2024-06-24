package org.example.order;

import org.example.inventory.InventoryRepository;
import org.example.user.UserRepository;
import org.springframework.stereotype.Service;

/**
 * @author andong@xiaomalixing.com
 */
@Service
public class OrderService {
    private final InventoryRepository inventoryRepository;

    private final UserRepository userRepository;

    public OrderService(InventoryRepository inventoryRepository, UserRepository userRepository) {
        this.inventoryRepository = inventoryRepository;
        this.userRepository = userRepository;
    }
}
