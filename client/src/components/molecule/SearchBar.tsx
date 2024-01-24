import styled from 'styled-components';
import Input from '../atom/Input';

import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';
import { faSearch } from '@fortawesome/free-solid-svg-icons';

const SearchBar = () => {
  return (
    <StyledSearchBar>
      <StyledSearchIcon icon={faSearch} />
      <Input type='text' placeholder='검색어를 입력해주세요' />
    </StyledSearchBar>
  );
};

const StyledSearchBar = styled.div`
  display: flex;
  align-items: center;
  position: relative;
`;

const StyledSearchIcon = styled(FontAwesomeIcon)`
  position: absolute;
  top: 32%;
  left: 15px;
  color: rgba(0, 0, 0, 0.5);
`;

export default SearchBar;
