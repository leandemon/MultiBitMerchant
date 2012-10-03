package org.multibit.mbm.api.request.cart;

import com.google.common.collect.Lists;
import org.codehaus.jackson.annotate.JsonProperty;
import org.multibit.mbm.api.response.CustomerCartItem;

import java.util.List;

/**
 *  <p>Request to provide the following to {@link org.multibit.mbm.resources.CartController}:</p>
 *  <ul>
 *  <li>Provision of client state to create a {@link org.multibit.mbm.db.dto.Cart}</li>
 *  </ul>
 *
 * @since 0.0.1
 *         
 */
public class CustomerCreateCartRequest {

  @JsonProperty
  List<CustomerCartItem> cartItems = Lists.newArrayList();

  public List<CustomerCartItem> getCartItems() {
    return cartItems;
  }

  public void setCartItems(List<CustomerCartItem> cartItems) {
    this.cartItems = cartItems;
  }
}