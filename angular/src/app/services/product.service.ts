import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Product } from '../common/product';
import { map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class ProductService {
  private baseUrl = 'http://localhost:8080/api/product-listings';

  constructor(private httpClient: HttpClient) { }

  /* 
  fetch the list of products from the backend api
  make http get response to backend api and map response to product array
  */
  getProductList(): Observable<Product[]> {
    return this.httpClient.get<GetResponse>(this.baseUrl).pipe(
      map(response => response._embedded.products)
    )
  }
}

// structure of the response from backend api
interface GetResponse {
  _embedded: {
    products: Product[];
  }
}
